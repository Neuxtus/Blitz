/*
 * Copyright 2007-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.laxser.blitz.web.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.laxser.blitz.web.ControllerErrorHandler;
import com.laxser.blitz.web.paramresolver.ParamResolver;


/**
 * 使用 {@link NotForSubModules} 标注在编写在模块目录中的拦截器、错误处理器
 * {@link ControllerErrorHandler}、 参数解析器 {@link ParamResolver} 上，表示不应用到子模块
 * 
 * @author 王志亮 [qieqie.wang@gmail.com]
 */
@Target( { ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NotForSubModules {

}
