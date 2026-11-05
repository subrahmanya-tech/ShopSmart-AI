
package com.telusko.springecomai.service;

import org.springframework.stereotype.Service;

@Service
public class AIImageGeneratorService {

    public byte[] generateImage(String prompt) {
        throw new UnsupportedOperationException(
                "AI image generation is temporarily unavailable. "
                + "A local image-generation model will be configured later."
        );
    }
}
