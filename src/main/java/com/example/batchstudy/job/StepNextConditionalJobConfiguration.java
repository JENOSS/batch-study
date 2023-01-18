package com.example.batchstudy.job;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class StepNextConditionalJobConfiguration {
    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job stepNextConditionalJob() {
        return jobBuilderFactory.get("stepNextConditionalJob")
                .start(conditionalJobStep1())
                    .on("FAILED")
                    .to(conditionalJobStep3())
                    .on("*") // 결과와 상관없이
                    .end()
                .from(conditionalJobStep1()) // 이벤트 리스너
                    .on("*") //Failed 외 전부
                    .to(conditionalJobStep2())
                    .next(conditionalJobStep3())
                    .on("*")
                    .end()
                .end()
                .build();

    }

    @Bean
    public Step conditionalJobStep1(){
        return stepBuilderFactory.get("step1")
                .tasklet((contribution, chunkContext) -> {
                    log.info(">>>>> this is stepNextConditionalJob Step 1");

                    // exitStatus 설정, 해당 status 보고 flow 진행 (on이 캐치)
//                    contribution.setExitStatus(ExitStatus.FAILED);

                    return RepeatStatus.FINISHED;
                })
                .build();
    }

    @Bean
    public Step conditionalJobStep2(){
        return stepBuilderFactory.get("step2")
                .tasklet((contribution, chunkContext) -> {
                    log.info(">>>>> this is stepNextConditionalJob Step 2");
                    return RepeatStatus.FINISHED;
                })
                .build();
    }

    @Bean
    public Step conditionalJobStep3(){
        return stepBuilderFactory.get("step3")
                .tasklet((contribution, chunkContext) -> {
                    log.info(">>>>> this is stepNextConditionalJob Step 3");
                    return RepeatStatus.FINISHED;
                })
                .build();
    }

}
