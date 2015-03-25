package de.hub.rcore.example;

import com.google.common.base.Objects;
import de.hub.randomemf.runtime.IGenerator;
import de.hub.randomemf.runtime.Ocl;
import de.hub.rcore.example.ELPrettyPrinter;
import de.hub.rcore.example.EMF2Json;
import de.hub.rcore.example.el.ELClass;
import de.hub.rcore.example.el.ELModel;
import de.hub.rcore.example.el.ELPackage;
import de.hub.rcore.example.el.ExampleLanguagePackage;
import de.hub.rcore.example.metrics.ELMetrics;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ELGenerator {
  public String generate(final IGenerator generator, final URI uri, final File hierarchyJson, final File methodCallsJson, final File code) {
    try {
      EObject _generate = generator.generate();
      final ELModel model = ((ELModel) _generate);
      boolean _notEquals = (!Objects.equal(code, null));
      if (_notEquals) {
        final PrintWriter out = new PrintWriter(code);
        EList<ELPackage> _packages = model.getPackages();
        final Function1<ELPackage, Boolean> _function = new Function1<ELPackage, Boolean>() {
          public Boolean apply(final ELPackage it) {
            String _name = it.getName();
            boolean _equals = _name.equals("predefined");
            return Boolean.valueOf((!_equals));
          }
        };
        Iterable<ELPackage> _filter = IterableExtensions.<ELPackage>filter(_packages, _function);
        final Function1<ELPackage, EList<ELClass>> _function_1 = new Function1<ELPackage, EList<ELClass>>() {
          public EList<ELClass> apply(final ELPackage it) {
            return it.getClasses();
          }
        };
        ArrayList<ELClass> _collectAll = Ocl.<ELPackage, ELClass>collectAll(_filter, _function_1);
        for (final ELClass generatedClass : _collectAll) {
          {
            ELPrettyPrinter _eLPrettyPrinter = new ELPrettyPrinter();
            Object _gen = _eLPrettyPrinter.gen(generatedClass);
            String _string = _gen.toString();
            String _replace = _string.replace("\t", "  ");
            out.println(_replace);
            out.println("-----------------------------------------------------");
          }
        }
        out.close();
      }
      final EMF2Json el2json = new EMF2Json();
      boolean _notEquals_1 = (!Objects.equal(hierarchyJson, null));
      if (_notEquals_1) {
        final PrintWriter out_1 = new PrintWriter(hierarchyJson);
        EList<ELPackage> _packages_1 = model.getPackages();
        final Function1<ELPackage, Boolean> _function_2 = new Function1<ELPackage, Boolean>() {
          public Boolean apply(final ELPackage it) {
            String _name = it.getName();
            boolean _equals = _name.equals("predefined");
            return Boolean.valueOf((!_equals));
          }
        };
        Iterable<ELPackage> _filter_1 = IterableExtensions.<ELPackage>filter(_packages_1, _function_2);
        EObject _get = ((EObject[])Conversions.unwrapArray(_filter_1, EObject.class))[0];
        Object _genHierarchy = el2json.genHierarchy(_get);
        String _string = _genHierarchy.toString();
        String _replace = _string.replace("\t", "  ");
        out_1.println(_replace);
        out_1.close();
      }
      boolean _notEquals_2 = (!Objects.equal(methodCallsJson, null));
      if (_notEquals_2) {
        final PrintWriter out_2 = new PrintWriter(methodCallsJson);
        EList<ELPackage> _packages_2 = model.getPackages();
        final Function1<ELPackage, Boolean> _function_3 = new Function1<ELPackage, Boolean>() {
          public Boolean apply(final ELPackage it) {
            String _name = it.getName();
            boolean _equals = _name.equals("predefined");
            return Boolean.valueOf((!_equals));
          }
        };
        final Iterable<ELPackage> list = IterableExtensions.<ELPackage>filter(_packages_2, _function_3);
        el2json.genMethodCalls(list, out_2);
        out_2.close();
      }
      boolean _notEquals_3 = (!Objects.equal(uri, null));
      if (_notEquals_3) {
        String _nsURI = ExampleLanguagePackage.eINSTANCE.getNsURI();
        EPackage.Registry.INSTANCE.put(_nsURI, ExampleLanguagePackage.eINSTANCE);
        Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
        XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
        _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
        final ResourceSetImpl rs = new ResourceSetImpl();
        final Resource r = rs.createResource(uri);
        EList<EObject> _contents = r.getContents();
        _contents.add(model);
        r.save(null);
      }
      ELMetrics _eLMetrics = new ELMetrics();
      EList<ELPackage> _packages_3 = model.getPackages();
      final Function1<ELPackage, Boolean> _function_4 = new Function1<ELPackage, Boolean>() {
        public Boolean apply(final ELPackage it) {
          String _name = it.getName();
          boolean _equals = _name.equals("predefined");
          return Boolean.valueOf((!_equals));
        }
      };
      Iterable<ELPackage> _filter_2 = IterableExtensions.<ELPackage>filter(_packages_3, _function_4);
      EObject _get_1 = ((EObject[])Conversions.unwrapArray(_filter_2, EObject.class))[0];
      return _eLMetrics.metrics(_get_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
