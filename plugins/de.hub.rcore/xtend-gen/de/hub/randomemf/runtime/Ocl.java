package de.hub.randomemf.runtime;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Ocl {
  public static <T extends Object, R extends Object> ArrayList<R> collect(final Iterable<T> col, final Function1<? super T, ? extends R> predicate) {
    ArrayList<R> _arrayList = new ArrayList<R>();
    final Function2<ArrayList<R>, T, ArrayList<R>> _function = new Function2<ArrayList<R>, T, ArrayList<R>>() {
      public ArrayList<R> apply(final ArrayList<R> r, final T e) {
        ArrayList<R> _xblockexpression = null;
        {
          R _apply = predicate.apply(e);
          r.add(_apply);
          _xblockexpression = r;
        }
        return _xblockexpression;
      }
    };
    return IterableExtensions.<T, ArrayList<R>>fold(col, _arrayList, _function);
  }
  
  public static <T extends Object, R extends Object> ArrayList<R> collectAll(final Iterable<T> col, final Function1<? super T, ? extends Iterable<R>> predicate) {
    ArrayList<R> _arrayList = new ArrayList<R>();
    final Function2<ArrayList<R>, T, ArrayList<R>> _function = new Function2<ArrayList<R>, T, ArrayList<R>>() {
      public ArrayList<R> apply(final ArrayList<R> r, final T e) {
        ArrayList<R> _xblockexpression = null;
        {
          Iterable<R> _apply = predicate.apply(e);
          Iterables.<R>addAll(r, _apply);
          _xblockexpression = r;
        }
        return _xblockexpression;
      }
    };
    return IterableExtensions.<T, ArrayList<R>>fold(col, _arrayList, _function);
  }
}
