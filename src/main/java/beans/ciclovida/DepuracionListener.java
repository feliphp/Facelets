/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.ciclovida;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DepuracionListener implements javax.faces.event.PhaseListener {
    Logger log = LogManager.getRootLogger();
      @Override
  public void afterPhase(PhaseEvent phaseEvent) {

    if (log.isInfoEnabled()) {
      log.info("AFTER PHASE: " + phaseEvent.getPhaseId().toString());
    }
  }

  @Override
  public void beforePhase(PhaseEvent phaseEvent) {
    if (log.isInfoEnabled()) {
      log.info("BEFORE PHASE: " + phaseEvent.getPhaseId().toString());
    }
  }

  @Override
  public PhaseId getPhaseId() {
    return PhaseId.ANY_PHASE;
  }
}
