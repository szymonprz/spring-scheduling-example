package pl.szymonprz.springscheduling.custom

import pl.szymonprz.springscheduling.logger

class SecondWorker : Runnable{
    override fun run() {
        logger.info("Second worker started")
        Thread.sleep(2000)
        logger.info("Second worker finished")
    }

    companion object {
        private val logger by logger()
    }
}