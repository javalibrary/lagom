/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package com.lightbend.lagom.it.two;

import static com.lightbend.lagom.javadsl.api.Service.call;
import static com.lightbend.lagom.javadsl.api.Service.named;

import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

public interface ServiceB extends Service {

    ServiceCall<String, String> helloB();

    default Descriptor descriptor() {
        return named("serviceB").with(
            call(this::helloB)
        );
    }
}
