package com.squaregps.interview.decoders;

import com.squaregps.interview.LocationMessage;
import com.squaregps.interview.MessageDecoder;

import javax.annotation.Nonnull;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/**
 * Декодер сообщений для <a href="https://wiki.teltonika.lt/view/RUT955_Protocols">
 * протокола Teltonika RUT955 (кодек 8).</a>
 */
public class TeltonikaRut955Decoder implements MessageDecoder {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<LocationMessage> decode(@Nonnull ByteBuffer buf) {

        // TODO implements me

        return Collections.emptyList();
    }

}
