/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$21 {

    static final FunctionDescriptor SSL_set_info_callback$cb$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle SSL_set_info_callback$cb$MH = RuntimeHelper.downcallHandle(
        constants$21.SSL_set_info_callback$cb$FUNC
    );
    static final FunctionDescriptor SSL_set_info_callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_set_info_callback$MH = RuntimeHelper.downcallHandle(
        "SSL_set_info_callback",
        constants$21.SSL_set_info_callback$FUNC
    );
    static final FunctionDescriptor SSL_set_verify_result$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SSL_set_verify_result$MH = RuntimeHelper.downcallHandle(
        "SSL_set_verify_result",
        constants$21.SSL_set_verify_result$FUNC
    );
    static final FunctionDescriptor SSL_get_ex_data_X509_STORE_CTX_idx$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle SSL_get_ex_data_X509_STORE_CTX_idx$MH = RuntimeHelper.downcallHandle(
        "SSL_get_ex_data_X509_STORE_CTX_idx",
        constants$21.SSL_get_ex_data_X509_STORE_CTX_idx$FUNC
    );
    static final FunctionDescriptor SSL_CTX_set_tmp_dh_callback$dh$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
}


