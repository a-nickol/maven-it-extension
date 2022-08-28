package com.soebes.itf.jupiter.extension;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for the {@link MavenGoal} annotation.
 *
 * <p>This test is intended to check the default value which has been defined
 * with the annotation and won't be changed unintentionally.</p>
 *
 * @author Karl Heinz Marbaise
 */
class MavenGoalTest {

  private MavenGoal mavenGoal;

  @BeforeEach
  void beforeEach() {
    this.mavenGoal = Helper.createAnnotation(this.getClass(), MavenGoal.class);
  }

  @Test
  void the_default_value_for_maven_goal() {
    assertThat(mavenGoal.value()).containsExactly("package");
  }

}
