/**
 *
 * $Id$
 */
package de.hub.rcore.example.el.validation;

import de.hub.rcore.example.el.ELOpKind;

/**
 * A sample validator interface for {@link de.hub.rcore.example.el.ELOp}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ELOpValidator {
	boolean validate();

	boolean validateKind(ELOpKind value);
	boolean validateSyntax(String value);
	boolean validateOperands(int value);
	boolean validatePrecedence(int value);
}
