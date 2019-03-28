/*
 * WekaDeeplearning4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WekaDeeplearning4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WekaDeeplearning4j.  If not, see <https://www.gnu.org/licenses/>.
 *
 * ActivationLReLU.java
 * Copyright (C) 2017-2018 University of Waikato, Hamilton, New Zealand
 */

package weka.dl4j.activations;

import static org.nd4j.linalg.activations.impl.ActivationLReLU.DEFAULT_ALPHA;

import java.util.Enumeration;
import org.nd4j.shade.jackson.annotation.JsonTypeName;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.OptionMetadata;

/**
 * A version of DeepLearning4j's ActivationLReLU that implements WEKA option handling.
 *
 * @author Eibe Frank
 * @author Steven Lang
 */
@JsonTypeName("LReLU")
public class ActivationLReLU
    extends Activation<org.nd4j.linalg.activations.impl.ActivationLReLU>
    implements OptionHandler {

  private static final long serialVersionUID = -8964799878986489846L;

  protected double alpha = DEFAULT_ALPHA;

  @Override
  public void initializeBackend() {
    backend = new org.nd4j.linalg.activations.impl.ActivationLReLU();
  }

  @OptionMetadata(
      displayName = "alpha",
      description = "The alpha value (default = " + DEFAULT_ALPHA + ").",
      commandLineParamName = "alpha",
      commandLineParamSynopsis = "-alpha <double>",
      displayOrder = 1
  )
  public double getAlpha() {
    return alpha;
  }

  public void setAlpha(double alpha) {
    this.alpha = alpha;
  }

  @Override
  public org.nd4j.linalg.activations.impl.ActivationLReLU getBackend() {
    return new org.nd4j.linalg.activations.impl.ActivationLReLU(alpha);
  }

  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {

    return Option.listOptionsForClass(this.getClass()).elements();
  }

  /**
   * Gets the current settings of the Classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {

    return Option.getOptions(this, this.getClass());
  }

  /**
   * Parses a given list of options.
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {

    Option.setOptions(options, this, this.getClass());
  }
}
