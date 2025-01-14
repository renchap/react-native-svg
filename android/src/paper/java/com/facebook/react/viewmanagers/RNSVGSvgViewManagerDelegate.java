/**
* This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
*
* Do not edit this file as changes may cause incorrect behavior and will be lost
* once the code is regenerated.
*
* @generated by codegen project: GeneratePropsJavaDelegate.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;

public class RNSVGSvgViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGSvgViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public RNSVGSvgViewManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "bbWidth":
        if (value instanceof String) {
          mViewManager.setBbWidth(view, (String) value);
        } else if (value instanceof Double) {
          mViewManager.setBbWidth(view, (Double) value);
        } else {
          mViewManager.setBbWidth(view, (Double) null);
        }
        break;
      case "bbHeight":
        if (value instanceof String) {
          mViewManager.setBbHeight(view, (String) value);
        } else if (value instanceof Double) {
          mViewManager.setBbHeight(view, (Double) value);
        } else {
          mViewManager.setBbHeight(view, (Double) null);
        }
        break;
      case "minX":
        mViewManager.setMinX(view, value == null ? Float.NaN : ((Double) value).floatValue());
        break;
      case "minY":
        mViewManager.setMinY(view, value == null ? Float.NaN : ((Double) value).floatValue());
        break;
      case "vbWidth":
        mViewManager.setVbWidth(view, value == null ? Float.NaN : ((Double) value).floatValue());
        break;
      case "vbHeight":
        mViewManager.setVbHeight(view, value == null ? Float.NaN : ((Double) value).floatValue());
        break;
      case "align":
        mViewManager.setAlign(view, value == null ? null : (String) value);
        break;
      case "meetOrSlice":
        mViewManager.setMeetOrSlice(view, value == null ? 0 : ((Double) value).intValue());
        break;
      case "tintColor":
        mViewManager.setTintColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      case "color":
        mViewManager.setColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }
}
