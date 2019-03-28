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
 * DropoutLayer.java
 * Copyright (C) 2016-2018 University of Waikato, Hamilton, New Zealand
 */

package weka.dl4j.layers;

import java.io.Serializable;
import java.util.Enumeration;
import org.deeplearning4j.nn.conf.dropout.Dropout;
import weka.classifiers.functions.dl4j.Utils;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.core.OptionMetadata;
import weka.dl4j.activations.ActivationReLU;
import weka.dl4j.dropout.AbstractDropout;
import weka.dl4j.schedules.ConstantSchedule.ConstantScheduleImpl;

/**
 * A version of DeepLearning4j's DropoutLayer that implements WEKA option handling.
 *
 * @author Christopher Beckham
 * @author Eibe Frank
 * @author Steven Lang
 */
public class DropoutLayer extends FeedForwardLayer<org.deeplearning4j.nn.conf.layers.DropoutLayer>
    implements OptionHandler, Serializable {


  private static final long serialVersionUID = 6776278263117585400L;

  /**
   * Constructor for setting some defaults.
   */
  public DropoutLayer() {
    super();
    setLayerName("Dropout layer");
    setActivationFunction(new ActivationReLU());
  }

  @Override
  public void initializeBackend() {
    Utils.runWithLocalClassloader(getClass(), () -> {
      backend = new org.deeplearning4j.nn.conf.layers.DropoutLayer();
      Dropout dropout = new Dropout(0.8);
      dropout.setPSchedule(new ConstantScheduleImpl());
      backend.setIDropout(dropout);
    });
  }

  @OptionMetadata(
      displayName = "dropout",
      description = "The dropout method to use (default = Dropout(0.8)).",
      commandLineParamName = "dropout",
      commandLineParamSynopsis = "-dropout <Dropout>",
      displayOrder = 25
  )
  public AbstractDropout getDropout() {
    return AbstractDropout.create(backend.getIDropout());
  }

  public void setDropout(AbstractDropout dropout) {
    backend.setIDropout(dropout.getBackend());
  }

  /**
   * Global info.
   *
   * @return string describing this class.
   */
  public String globalInfo() {
    return "A dropout layer from DeepLearning4J.";
  }

  /**
   * Returns an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  @Override
  public Enumeration<Option> listOptions() {
    return Option.listOptionsForClassHierarchy(this.getClass(), super.getClass()).elements();
  }

  /**
   * Gets the current settings of the Classifier.
   *
   * @return an array of strings suitable for passing to setOptions
   */
  @Override
  public String[] getOptions() {
    return Option.getOptionsForHierarchy(this, super.getClass());
  }

  /**
   * Parses a given list of options.
   *
   * @param options the list of options as an array of strings
   * @throws Exception if an option is not supported
   */
  public void setOptions(String[] options) throws Exception {
    Option.setOptionsForHierarchy(options, this, super.getClass());
  }
}
