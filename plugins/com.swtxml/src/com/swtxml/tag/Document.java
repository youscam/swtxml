package com.swtxml.tag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.swtxml.parser.XmlParsingException;
import com.swtxml.swt.properties.IIdResolver;

public class Document implements IIdResolver {

	private Map<String, TagNode> nodesById = new HashMap<String, TagNode>();

	public <T> T getById(String id, Class<T> clazz) {
		TagNode node = nodesById.get(id);
		if (node == null) {
			return null;
		}

		return node.get(clazz);
	}

	public TagNode getRoot() {
		return root;
	}

	private List<TagNode> allNodes = new ArrayList<TagNode>();
	private TagNode root;

	void register(TagNode node) {
		if (node.getParent() == null) {
			if (root != null) {
				throw new XmlParsingException("Root node already set!");
			}
			this.root = node;
		}
		String id = node.getAttribute("id");
		if (id != null) {
			nodesById.put(id, node);
		}
		this.allNodes.add(node);
	}

	@Deprecated
	public Collection<TagNode> getAllNodes() {
		return allNodes;
	}

}