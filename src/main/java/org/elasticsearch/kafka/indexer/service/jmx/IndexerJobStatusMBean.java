package org.elasticsearch.kafka.indexer.service.jmx;

import org.elasticsearch.kafka.indexer.jobs.IndexerJobStatusEnum;

public interface IndexerJobStatusMBean {
	long getLastCommittedOffset();
	IndexerJobStatusEnum getJobStatus();
	int getPartition();
}
