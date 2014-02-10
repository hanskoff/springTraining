package eu.solidcraft.starter

import base.IntegrationSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier

class ScoreCalculatorSpec extends IntegrationSpec {

  @Autowired
  @Qualifier("polish")
  ScoreCalculator scoreCalculator

  @Autowired
  @Qualifier("english")
  ScoreCalculator scoreCalculatorEng

  def "score calculator should be injected"() {
    expect:
    scoreCalculator != null
  }

  @Autowired
  RememberRule rememberRule

  def "should increase score"() {
    when:
    rememberRule.increaseScore()
    then:
    rememberRule.mapSize() ==1
  }


}
