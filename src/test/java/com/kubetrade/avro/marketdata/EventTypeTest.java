package com.kubetrade.avro.marketdata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTypeTest {

    @Test
    void createEventType() {
        EventType eventType = EventType.CREATE;
        assertThat(eventType.name()).isEqualTo("CREATE");
    }

}
