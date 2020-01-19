package pl.szymonprz.springscheduling.custom

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor

class FirstWorkerScheduler(private val executor: ThreadPoolTaskExecutor) {

    @Scheduled(fixedDelayString = "5000")
    fun runFirstWorker(){
        executor.execute(FirstWorker())
    }
}