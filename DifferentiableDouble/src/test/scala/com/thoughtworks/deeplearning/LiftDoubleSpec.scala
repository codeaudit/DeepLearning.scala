package com.thoughtworks.deeplearning

import cats._
import cats.implicits._
import com.thoughtworks.deeplearning.DifferentiableDouble._
import com.thoughtworks.deeplearning.Lift._
import com.thoughtworks.deeplearning.Layer.Batch
import com.thoughtworks.deeplearning._
import org.scalatest._

/**
  * @author 杨博 (Yang Bo) &lt;pop.atry@gmail.com&gt;
  */
final class LiftDoubleSpec extends FreeSpec with Matchers {
  "Lift[Double] should be a double batch" in {
    """implicitly[shapeless.the.`Lift[Double]`.T <:< Batch.Aux[Double, Double]]""" should compile
  }

  "<=> should create Layers" in {
    """implicitly[shapeless.the.`Double <=> Double`.T =:= Layer.Aux[Batch.Aux[Double, Double], Batch.Aux[Double, Double]]]""" should compile
  }
}
