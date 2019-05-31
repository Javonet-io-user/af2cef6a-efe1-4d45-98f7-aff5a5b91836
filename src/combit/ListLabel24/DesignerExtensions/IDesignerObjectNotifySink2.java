package combit.ListLabel24.DesignerExtensions;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import combit.ListLabel24.DesignerExtensions.*;
import jio.System.*;
import combit.ListLabel24.*;

public interface IDesignerObjectNotifySink2 extends IDesignerObjectNotifySink {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer UpdateView(java.lang.Integer nFlags, java.lang.Boolean bImmediate);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SetActive(java.lang.Boolean bActive);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer NotifyParsingError(
      java.lang.String bsExpr, java.lang.String bsErrortext);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer NotifyOutdatedProperty(
      java.lang.String property, java.lang.String value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer NotifyObjectGone();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetObjectRect(IntPtr pRect);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetContentsRect(IntPtr pRect);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetObjectID(IntPtr pObjectID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetObjectRect(RECT prcObject, IntPtr pObjectID);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetAllowedTablesManager(java.lang.Boolean addChildTablesOfLowestPath);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer AddVariableToSourceTablePath(IntPtr pVar);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ResetIdleIterationCounter();
}
