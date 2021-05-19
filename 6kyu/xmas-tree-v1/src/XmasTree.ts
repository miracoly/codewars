class XmasTree {

    readonly height: number;
    readonly tree: string[];

    private constructor(height: number, tree: string[]) {
        this.height = height;
        this.tree = tree;
    }

    public static fromHeight(height: number): XmasTree {
        const tree: string[] = [];
        for (let i = 1; i <= height; i++) {
            tree.push(this.generateTreeLevel(i, height));
        }
        return new XmasTree(height, tree);
    }

    public toString(): string {
        const strTree = this.tree.reduce((acc, curr, i, tree) => acc + (i !== tree.length - 1) ? "\n" : "", "");
        return strTree;
    }

    static generateTreeLevel(levelFromTop: number, height: number): string {
        const stars = this.generateStars(levelFromTop);
        const starsWithSpaces = this.addSpacesToStars(stars, height);
        return starsWithSpaces;
    }

    static addSpacesToStars(stars: string, height: number): string {
        const width = 2 * height - 1;
        const spacesPerSite = (width - stars.length) / 2;
        return " ".repeat(spacesPerSite) + stars;
    }

    static generateStars(count: number): string {
        if (count <= 1) {
            return "*";
        }
        return "**" + this.generateStars(count - 1);
    }

}

export default XmasTree;

