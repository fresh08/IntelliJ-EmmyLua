/*
 * Copyright (c) 2017. tangzx(love.tangzx@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tang.intellij.lua.debugger.remote.commands;

import com.tang.intellij.lua.debugger.remote.LuaMobDebugProcess;
import com.tang.intellij.lua.debugger.remote.MobClient;

import java.io.IOException;

/**
 * Remote Debug Command
 * Created by tangzx on 2016/12/31.
 */
public abstract class DebugCommand {

    LuaMobDebugProcess debugProcess;

    public void setDebugProcess(LuaMobDebugProcess process) {
        debugProcess = process;
    }

    public abstract void write(MobClient writer) throws IOException;
    public abstract int handle(String data);
    public abstract int getRequireRespLines();
    public abstract boolean isFinished();
}
