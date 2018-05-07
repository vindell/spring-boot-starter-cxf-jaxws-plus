/*
 * Copyright (c) 2017, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.cxf.spring.boot.javassist.proxy;

import java.lang.annotation.Annotation;

import org.apache.cxf.spring.boot.entity.A;
import org.apache.cxf.spring.boot.jaxws.proxy.JavassistProxy;
import org.junit.Test;

public class JavassistProxy_Test {

	@Test
	public void testProxy1() throws Exception{
		
		A target = new A();
		A proxy = JavassistProxy.getProxy(target);

		for (Annotation a : proxy.getClass().getAnnotations()) {
			System.out.println("xxx:" + a.toString());
		}
		
		proxy.save("xxx");
		
	}
	
	@Test
	public void testProxy2() throws Exception{
		
		A proxy = JavassistProxy.getProxy(A.class);

		for (Annotation a : proxy.getClass().getAnnotations()) {
			System.out.println("xxx:" + a.toString());
		}
		
		proxy.del("xs");
		
	}
	
}