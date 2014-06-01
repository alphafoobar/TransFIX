/*
 * Copyright 2013 Peter Lawrey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.openhft.fix.include.v42;

import net.openhft.lang.collection.HugeArray;
import net.openhft.lang.collection.HugeCollections;

public class Message 
{
    protected HugeArray<Field> field;
    protected HugeArray<Group> group;
    protected String msgcat;
    protected String msgtype;
    protected String name;
    protected int fieldSize;
    protected int groupSize;

    public Message setFieldSize(int fieldSize){this.fieldSize=fieldSize;return this;}
    public Message setGroupSize(int groupSize){this.groupSize=groupSize;return this;}
    
    public HugeArray <Field> getField() {
        if (field == null) {
            field = HugeCollections.newArray(Field.class, fieldSize);
        }
        return this.field;
    }
    
    public HugeArray <Group> getGroup() {
        if (group == null) {
        	group = HugeCollections.newArray(Group.class, groupSize);
        }
        return this.group;
    }

    public String getMsgcat() {
        return msgcat;
    }

    public void setMsgcat(String value) {
        this.msgcat = value;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String value) {
        this.msgtype = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
