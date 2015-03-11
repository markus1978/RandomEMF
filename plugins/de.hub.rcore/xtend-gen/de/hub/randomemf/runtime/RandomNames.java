package de.hub.randomemf.runtime;

import cern.jet.random.engine.RandomEngine;
import de.hub.randomemf.runtime.NameGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class RandomNames {
  private final NameGenerator names;
  
  private final String nameDescription = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("-a");
      _builder.newLine();
      _builder.append("-al");
      _builder.newLine();
      _builder.append("-au +c");
      _builder.newLine();
      _builder.append("-an");
      _builder.newLine();
      _builder.append("-ba");
      _builder.newLine();
      _builder.append("-be");
      _builder.newLine();
      _builder.append("-bi");
      _builder.newLine();
      _builder.append("-br +v");
      _builder.newLine();
      _builder.append("-da");
      _builder.newLine();
      _builder.append("-di");
      _builder.newLine();
      _builder.append("-do");
      _builder.newLine();
      _builder.append("-du");
      _builder.newLine();
      _builder.append("-e");
      _builder.newLine();
      _builder.append("-eu +c");
      _builder.newLine();
      _builder.append("-fa");
      _builder.newLine();
      _builder.append("bi");
      _builder.newLine();
      _builder.append("be");
      _builder.newLine();
      _builder.append("bo");
      _builder.newLine();
      _builder.append("bu");
      _builder.newLine();
      _builder.append("nul +v");
      _builder.newLine();
      _builder.append("gu");
      _builder.newLine();
      _builder.append("da");
      _builder.newLine();
      _builder.append("au +c -c");
      _builder.newLine();
      _builder.append("fri");
      _builder.newLine();
      _builder.append("gus");
      _builder.newLine();
      _builder.append("+tus");
      _builder.newLine();
      _builder.append("+lus");
      _builder.newLine();
      _builder.append("+lius");
      _builder.newLine();
      _builder.append("+nus");
      _builder.newLine();
      _builder.append("+es");
      _builder.newLine();
      _builder.append("+ius -c");
      _builder.newLine();
      _builder.append("+cus");
      _builder.newLine();
      _builder.append("+tor");
      _builder.newLine();
      _builder.append("+cio");
      _builder.newLine();
      _builder.append("+tin");
      _builder.newLine();
      String _string = _builder.toString();
      return _string;
    }
  }.apply();
  
  public RandomNames(final RandomEngine rand) {
    try {
      NameGenerator _nameGenerator = new NameGenerator(this.nameDescription, rand);
      this.names = _nameGenerator;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String className(final int syls) {
    String _compose = this.names.compose(syls);
    return StringExtensions.toFirstUpper(_compose);
  }
  
  public String variableName(final int syls) {
    String _compose = this.names.compose(syls);
    return StringExtensions.toFirstLower(_compose);
  }
  
  public String methodName(final int syls) {
    String _compose = this.names.compose(syls);
    return StringExtensions.toFirstLower(_compose);
  }
}
