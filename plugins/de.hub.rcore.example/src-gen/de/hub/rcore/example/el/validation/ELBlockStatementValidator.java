/**
 *
 * $Id$
 */
package de.hub.rcore.example.el.validation;

import de.hub.rcore.example.el.ELBlock;
import de.hub.rcore.example.el.ELBlockStarementKind;
import de.hub.rcore.example.el.ELExpression;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.hub.rcore.example.el.ELBlockStatement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ELBlockStatementValidator {
	boolean validate();

	boolean validateBlock(EList<ELBlock> value);
	boolean validateKind(ELBlockStarementKind value);
	boolean validateExpressions(EList<ELExpression> value);

	boolean validateExpressions(ELExpression value);
}
