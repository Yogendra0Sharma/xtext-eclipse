/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.refactoring.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractRefactoringTestLanguageValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.eclipse.xtext.ui.tests.refactoring.refactoring.RefactoringPackage.eINSTANCE);
		return result;
	}
	
}
