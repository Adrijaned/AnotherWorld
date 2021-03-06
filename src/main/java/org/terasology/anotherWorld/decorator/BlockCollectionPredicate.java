/*
 * Copyright 2015 MovingBlocks
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
package org.terasology.anotherWorld.decorator;

import com.google.common.base.Predicate;
import org.terasology.world.block.Block;

import java.util.Collection;
import java.util.Collections;

public class BlockCollectionPredicate implements Predicate<Block> {
    private Collection<Block> blocks;

    public BlockCollectionPredicate(Block block) {
        this(Collections.singleton(block));
    }

    public BlockCollectionPredicate(Collection<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public boolean apply(Block block) {
        return blocks.contains(block);
    }
}
