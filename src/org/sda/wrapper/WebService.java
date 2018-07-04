package org.sda.wrapper;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.FormParam;

import org.aksw.triple2nl.TripleConverter;
import org.apache.jena.graph.NodeFactory;
import org.apache.jena.graph.Triple;

@Path("/")
public class WebService {
	@POST
	@Path("/triple2nl")
	public String triple2nl(@FormParam("val1") String val1, @FormParam("val2") String val2,
			@FormParam("val3") String val3) {
		Triple triple = Triple.create(NodeFactory.createURI(val1), NodeFactory.createURI(val2),
				NodeFactory.createURI(val3));

		TripleConverter converter = new TripleConverter();
		String text = converter.convert(triple);
		System.out.println(triple + "\n-> " + text);

		return text;
	}

}
