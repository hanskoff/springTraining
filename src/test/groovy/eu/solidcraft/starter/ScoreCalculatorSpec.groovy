package eu.solidcraft.starter

import base.IntegrationSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier

class ScoreCalculatorSpec extends IntegrationSpec {

  @Autowired
  @Qualifier("polish")
  ScoreCalculator scoreCalculator

  def "score calculator should be injected"() {
    expect:
    scoreCalculator != null
  }
}
