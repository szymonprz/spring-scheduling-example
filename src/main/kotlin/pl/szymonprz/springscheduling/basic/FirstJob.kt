package pl.szymonprz.springscheduling.basic

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import pl.szymonprz.springscheduling.logger

//@Component
class FirstJob {

    @Scheduled(fixedDelayString = "5000")
    fun execute() {
        logger.info("executing first job")
        Thread.sleep(2000)
        logger.info("finished first job")
    }

    companion object {
        private val logger by logger()
    }
}