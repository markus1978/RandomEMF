package de.hub.rcore.example;

import de.hub.rcore.example.ELGenerator;
import de.hub.rcore.example.Java2Json;
import de.hub.rcore.example.RandomEL;
import de.hub.rcore.example.RandomUniformCallsEL;
import de.hub.rcore.example.SyntheticEL;
import java.io.File;
import java.io.PrintWriter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    try {
      final ELGenerator generator = new ELGenerator();
      RandomEL _randomEL = new RandomEL();
      File _file = new File("model/hierarchy/el.json");
      File _file_1 = new File("model/dependencies/el.json");
      File _file_2 = new File("model/el.code");
      final String elMetrics = generator.generate(_randomEL, null, _file, _file_1, _file_2);
      RandomUniformCallsEL _randomUniformCallsEL = new RandomUniformCallsEL();
      File _file_3 = new File("model/dependencies/eluniformcalls.json");
      final String elUniformCallsMetrics = generator.generate(_randomUniformCallsEL, null, null, _file_3, null);
      SyntheticEL _syntheticEL = new SyntheticEL();
      File _file_4 = new File("model/hierarchy/synthetic.json");
      final String syntheticMetrics = generator.generate(_syntheticEL, null, _file_4, null, null);
      Java2Json _java2Json = new Java2Json();
      final String javaMetrics = _java2Json.generate();
      File _file_5 = new File("model/metrics/metrics.csv");
      final PrintWriter out = new PrintWriter(_file_5);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("name,elements,classes,methods per class, method calls,elements per method, depth");
      _builder.newLine();
      _builder.append("el, ");
      _builder.append(elMetrics, "");
      _builder.newLineIfNotEmpty();
      _builder.append("calls, ");
      _builder.append(elUniformCallsMetrics, "");
      _builder.newLineIfNotEmpty();
      _builder.append("synthetic, ");
      _builder.append(syntheticMetrics, "");
      _builder.newLineIfNotEmpty();
      _builder.append("java, ");
      _builder.append(javaMetrics, "");
      _builder.newLineIfNotEmpty();
      out.print(_builder);
      out.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
