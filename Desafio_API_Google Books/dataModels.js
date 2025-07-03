class Book {
    constructor(id, title, authors, publisher, publishedDate, description, pageCount, categories, thumbnail, language, infoLink) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.description = description;
        this.pageCount = pageCount;
        this.categories = categories;
        this.thumbnail = thumbnail;
        this.language = language;
        this.infoLink = infoLink;
    }

    render() {
        const authors = Array.isArray(this.authors) ? this.authors.join(', ') : this.authors === undefined ? 'N/A' : this.authors; // garante a exibição correta do conteúdo no caso de ser um array ou undefined
        const categories = Array.isArray(this.categories) ? this.categories.join(', ') : this.categories === undefined ? 'N/A' : this.categories; // garante a exibição correta do conteúdo no caso de ser um array ou undefined
        const bookElement = document.createElement('div');
        bookElement.className = 'mb-3';
        bookElement.ariaLabel = this.title;
        bookElement.innerHTML = `
        <h2 id="bookTitle" tabindex="-1">${this.title}</h2>
        <p><strong>Autores:</strong> ${authors}</p>
            <p><strong>Editora:</strong> ${this.publisher}</p>
            <p><strong>Data de publicação:</strong> ${this.publishedDate}</p>
            <p><strong>Páginas:</strong> ${this.pageCount}</p>
            <p><strong>Categorias:</strong> ${categories}</p>
            <img src="${this.thumbnail}" alt="${this.title}" class="img-thumbnail">
            <p><a href="${this.infoLink}" target="_blank">Mais informações</a></p>
        `;
        return bookElement;
    }


}

class BookLike {
 constructor(id, title, authors, publisher, publishedDate, description, pageCount, categories, thumbnail, language, infoLink) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.description = description;
        this.pageCount = pageCount;
        this.categories = categories;
        this.thumbnail = thumbnail;
        this.language = language;
        this.infoLink = infoLink;
    }
    
    render() {
        const bookLikeElement = document.createElement('div');
        bookLikeElement.className = 'mb-3';
        bookLikeElement.ariaLabel = this.title;
        bookLikeElement.innerHTML = `
        <h2>${this.title}</h2>
        <p><strong>Autores:</strong> ${this.authors.join(', ')}</p>
            <p><strong>Editora:</strong> ${this.publisher}</p>
            <p><strong>Data de publicação:</strong> ${this.publishedDate}</p>
            <p><strong>Páginas:</strong> ${this.pageCount}</p>
            <p><strong>Categorias:</strong> ${this.categories.join(', ')}</p>
            <img src="${this.thumbnail}" alt="${this.title}" class="img-thumbnail">
            <p><a href="${this.infoLink}" target="_blank">Mais informações</a></p>
        `;
        return bookLikeElement;
    }
}

