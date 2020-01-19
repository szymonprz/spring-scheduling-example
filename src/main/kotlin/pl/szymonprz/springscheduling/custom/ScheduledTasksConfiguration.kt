package pl.szymonprz.springscheduling.custom

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor

@Configuration
class ScheduledTasksConfiguration {

    @Bean
    fun firstWorkerScheduler(firstThreadPoolTaskExecutor: ThreadPoolTaskExecutor): FirstWorkerScheduler =
            FirstWorkerScheduler(firstThreadPoolTaskExecutor)

    @Bean
    fun secondWorkerScheduler(secondThreadPoolTaskExecutor: ThreadPoolTaskExecutor): SecondWorkerScheduler =
            SecondWorkerScheduler(secondThreadPoolTaskExecutor)

    @Bean
    fun secondThreadPoolTaskExecutor(): ThreadPoolTaskExecutor {
        val threadPoolTaskExecutor = ThreadPoolTaskExecutor()
        threadPoolTaskExecutor.corePoolSize = 1
        threadPoolTaskExecutor.maxPoolSize = 1
        threadPoolTaskExecutor.setThreadNamePrefix("second-thread-pool-")
        threadPoolTaskExecutor.initialize()
        return threadPoolTaskExecutor
    }

    @Bean
    fun firstThreadPoolTaskExecutor(): ThreadPoolTaskExecutor {
        val threadPoolTaskExecutor = ThreadPoolTaskExecutor()
        threadPoolTaskExecutor.corePoolSize = 1
        threadPoolTaskExecutor.maxPoolSize = 1
        threadPoolTaskExecutor.setThreadNamePrefix("first-thread-pool-")
        threadPoolTaskExecutor.initialize()
        return threadPoolTaskExecutor
    }
}