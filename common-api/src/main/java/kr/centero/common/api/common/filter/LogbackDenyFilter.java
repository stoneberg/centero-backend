package kr.centero.common.api.common.filter;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

import java.util.Arrays;
import java.util.List;

public class LogbackDenyFilter extends Filter<ILoggingEvent> {

    private static final List<String> filteredPhrases = Arrays.asList(
            " Preparing: ",
            " Parameters: ",
            " Updates: "
    );

    @Override
    public FilterReply decide(ILoggingEvent event) {
        for (String phrase : filteredPhrases) {
            if (event.getMessage().contains(phrase)) {
                return FilterReply.DENY;
            }
        }
        return FilterReply.ACCEPT;
    }
}