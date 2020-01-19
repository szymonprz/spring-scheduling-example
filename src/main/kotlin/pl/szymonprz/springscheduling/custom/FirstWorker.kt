package pl.szymonprz.springscheduling.custom

import pl.szymonprz.springscheduling.logger

class FirstWorker : Runnable {
    override fun run() {
        logger.info("First worker started")
        Thread.sleep(2000)
        logger.info("First worker finished")
    }

    companion object {
        private val logger by logger()
    }
}