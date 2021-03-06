package fil.iagl.opl.cocospoon.insert.impl;

import fil.iagl.opl.cocospoon.insert.Insertion;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtTry;
import spoon.reflect.declaration.CtElement;

public class TryInsert implements Insertion {

  @Override
  public boolean match(CtElement element) {
    return element instanceof CtTry;
  }

  @Override
  public void apply(CtElement element, CtStatement statementToInsert) {
    CtTry ctTry = (CtTry) element;
    ctTry.insertBefore(statementToInsert);
  }

}
