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
        this.like = undefined;
    }

    render() {
        const bookElement = document.createElement('div');
        bookElement.className = 'mb-3';
        bookElement.ariaLabel = this.title;
        bookElement.innerHTML = `
        <h2>${this.title}</h2>
        <p><strong>Autores:</strong> ${this.authors.join(', ')}</p>
            <p><strong>Editora:</strong> ${this.publisher}</p>
            <p><strong>Data de publicação:</strong> ${this.publishedDate}</p>
            <p><strong>Páginas:</strong> ${this.pageCount}</p>
            <p><strong>Categorias:</strong> ${this.categories.join(', ')}</p>
            <img src="${this.thumbnail}" alt="${this.title}" class="img-thumbnail">
            <p><a href="${this.infoLink}" target="_blank">Mais informações</a></p>
        `;
        return bookElement;
    }


}
