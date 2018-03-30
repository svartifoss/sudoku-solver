package is.svartifoss.sudoku.model;

public class DeterministicCellFill<T> implements CellFill<T> {

    private final Cell<T> cell;

    private final T value;

    public DeterministicCellFill(final Cell<T> cell, final T value) {
        this.cell = cell;
        this.value = value;
    }

    @Override
    public Sudoku<T> apply() {
        return new Sudoku<>(cell.getSudoku(), cell, value);
    }

    @Override
    public Sudoku<T> revert() {
        return cell.getSudoku();
    }

    @Override
    public boolean isTrial() {
        return false;
    }
}
