package de.hub.rcore.example;

import de.hub.rcore.example.el.ELBlockStarementKind;
import de.hub.rcore.example.el.ELDataType;
import de.hub.rcore.example.el.ELModel;
import de.hub.rcore.example.el.ELOp;
import de.hub.rcore.example.el.ELOpKind;
import de.hub.rcore.example.el.ELPackage;
import de.hub.rcore.example.el.ExampleLanguageFactory;

public class ELPredefinitions {
	
	private final ELModel model;
	private final ELPackage predfined;
	
	public static ELPackage pkg(ELModel model) {
		return new ELPredefinitions(model).predfined;
	}
	
	private ELPredefinitions(ELModel model) {
		this.model = model;
		this.predfined = fac().createELPackage();
		this.predfined.setName("predefined");
		this.model.getPackages().add(predfined);
		init();
	}
	
	private void init() {
		addOp(ELOpKind.SUFFIX, "--", 1, 1);
		addOp(ELOpKind.SUFFIX, "++", 1, 1);
		addOp(ELOpKind.SYNTAX, "#1[#2]", 2, 1);
		
		addOp(ELOpKind.PREFIX, "!", 1, 2);
		addOp(ELOpKind.PREFIX, "--", 1, 2);
		addOp(ELOpKind.PREFIX, "++", 1, 2);
		
		addOp(ELOpKind.INFIX, "*", 2, 4);
		addOp(ELOpKind.INFIX, "/", 2, 4);
		
		addOp(ELOpKind.INFIX, "+", 2, 5);
		addOp(ELOpKind.INFIX, "-", 2, 5);
		
		addOp(ELOpKind.INFIX, ">", 2, 7);
		addOp(ELOpKind.INFIX, "<", 2, 7);
		addOp(ELOpKind.INFIX, ">=", 2, 7);
		addOp(ELOpKind.INFIX, "<=", 2, 7);
		
		addOp(ELOpKind.INFIX, "==", 2, 8);
		addOp(ELOpKind.INFIX, "!=", 2, 8);
		
		addOp(ELOpKind.INFIX, "&&", 2, 12);
		addOp(ELOpKind.INFIX, "||", 2, 13);

		addBlock("if (#1) {&1}", 1, 1);
		addBlock("if (#1) {&1} else {&2}", 1, 2);
		addBlock("while (#1) {&1}", 1, 1);
		addBlock("for (#1;#2;#3) {&1}", 3, 1);
		
		addType("int");
	}
	
	private static ExampleLanguageFactory fac() {
		return ExampleLanguageFactory.eINSTANCE;
	}
	
	private void addType(String name) {
		ELDataType type = fac().createELDataType();
		type.setName(name);
		predfined.getClasses().add(type);
	}
	
	private void addBlock(String syntax, int expressions, int blocks) {
		ELBlockStarementKind block = fac().createELBlockStarementKind();
		block.setSyntax(syntax);
		block.setExpressions(expressions);
		block.setBlocks(blocks);
		model.getBlocks().add(block);
	}
	
	private void addOp(ELOpKind kind, String syntax, int operands, int precedence) {
		ELOp op = fac().createELOp();
		op.setKind(kind);
		op.setSyntax(syntax);
		op.setOperands(operands);
		op.setPrecedence(precedence);
		model.getOps().add(op);
	}
}
