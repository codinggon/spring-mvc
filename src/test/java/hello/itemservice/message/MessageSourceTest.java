package hello.itemservice.message;

import org.assertj.core.api.Assertions;
import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;

import static org.assertj.core.api.Assertions.*;


@SpringBootTest
public class MessageSourceTest {

    @Autowired
    MessageSource messageSource;

    @DisplayName("")
    @Test
    public void _테스트() throws Exception{
        String hello = messageSource.getMessage("hello", null, null);
        System.out.println("hello = " + hello);
        assertThat(hello).isEqualTo("안녕");



    }

    @DisplayName("")
    @Test
    public void notFoundMessageCode() throws Exception{
        assertThatThrownBy(() -> messageSource.getMessage("no_code", null, null)).isInstanceOf(NoSuchMessageException.class);
    }

    @DisplayName("")
    @Test
    public void _테스트3() throws Exception{

        String message = messageSource.getMessage("hello.name", new Object[]{"spring"}, Locale.ENGLISH);
        assertThat(message).isEqualTo("hello spring");
    }




}







