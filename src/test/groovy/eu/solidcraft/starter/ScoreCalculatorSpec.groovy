package eu.solidcraft.starter

import base.IntegrationSpec
import org.springframework.beans.factory.annotation.Autowired

class ScoreCalculatorSpec extends IntegrationSpec {

  @Autowired
  ScoreCalculator scoreCalculator

  def "score calculator should be injected"() {
    expect:
    scoreCalculator != null
  }
}
