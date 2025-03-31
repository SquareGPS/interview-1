package com.squaregps.interview.decoders;

import com.squaregps.interview.LocationMessage;
import com.squaregps.interview.MessageDecoder;

import javax.annotation.Nonnull;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/**
 * Декодер сообщений для <a href="https://wiki.teltonika-networks.com/view/RUT955_GPS_Protocols">
 * протокола Teltonika RUT955 (кодек 8).</a>
 */
public class TeltonikaRut955Decoder implements MessageDecoder {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<LocationMessage> decode(@Nonnull ByteBuffer buf) {

        // TODO implement me

        return Collections.emptyList();
    }

}
