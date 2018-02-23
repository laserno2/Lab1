package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoundTest {

	@Test
	public void test() {
		for (int a = 0; a< 10000;a++) {
			Round r = new Round();
			if (Round.isNatural(r.ComeOutRollScore())) {
				assertEquals(eGameResult.NATURAL, r.geteGameResult());
			}
			if (Round.isCraps(r.ComeOutRollScore())) {
				assertEquals(eGameResult.CRAPS, r.geteGameResult());
			}
			if (r.RollCount()> 0) {
				if(r.ComeOutRollScore() == r.GetLastRoll()) {
					assertEquals(eGameResult.POINT,r.geteGameResult());
				}
			}
		}
	}

}
