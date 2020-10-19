package io.github.hulang1024.chinesechess.rule.chess;

import io.github.hulang1024.chinesechess.rule.AbstractChess;
import io.github.hulang1024.chinesechess.rule.ChessPosition;

/**
 * 车
 * @author Hu Lang
 */
public class ChessR extends AbstractChess {
    @Override
    public boolean canGoTo(ChessPosition destPos) {
        // 车 的移动规则已被全局移动规则完全包括
        return true;
    }
}
