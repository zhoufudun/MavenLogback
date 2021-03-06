package com.zhoufudun.util;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ANSIConstants;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;
/**
 * logback自定义日志颜色---eclipse测试失败
 * @author 19026404
 *
 */
public class LogBackColorUtil extends ForegroundCompositeConverterBase<ILoggingEvent> {

    @Override
    protected String getForegroundColorCode(ILoggingEvent event) {
        Level level = event.getLevel();
        switch (level.toInt()) {
        case Level.ERROR_INT:
            return ANSIConstants.BOLD + ANSIConstants.RED_FG; // same as default color scheme
        case Level.WARN_INT:
            return ANSIConstants.RED_FG;// same as default color scheme
        case Level.INFO_INT:
            return ANSIConstants.CYAN_FG; // use CYAN instead of BLUE
        default:
            return ANSIConstants.DEFAULT_FG;
        }
    }

}
