/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.amplugin.timeline.client.chart;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_timeline")
public class SpiralChart extends CurveChart {

    @JsProperty
    public int endAngle;

    @JsProperty
    public int innerRadius;

    @JsProperty
    public boolean inversed;

    @JsProperty
    public int levelCount;

    @JsProperty
    public int precisionStep;

    @JsProperty
    public int radiusStep;

    @JsProperty
    public int startAngle;

    @JsProperty
    public int yAxisInnerRadius;

    @JsProperty
    public int yAxisRadius;
}
