import com.example.ATMZ
import spock.lang.Specification

class ATMSpec extends Specification {
    def "balance show deposit"(){
        given:
        def atm = new ATMZ()

        when:
        atm.deposit(5000, 2)
        atm.deposit(100, 3)

        then:
        atm.balance() == 10300
    }
}


