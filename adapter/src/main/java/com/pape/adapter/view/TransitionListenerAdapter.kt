/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pape.adapter.view

import android.annotation.TargetApi
import android.os.Build
import android.transition.Transition

/**
 * Empty implementation of [Transition.TransitionListener].
 */

@TargetApi(Build.VERSION_CODES.KITKAT)
open class TransitionListenerAdapter : Transition.TransitionListener {

    override fun onTransitionStart(transition: Transition) = Unit

    override fun onTransitionEnd(transition: Transition) = Unit

    override fun onTransitionCancel(transition: Transition) = Unit

    override fun onTransitionPause(transition: Transition) = Unit

    override fun onTransitionResume(transition: Transition) = Unit
}
