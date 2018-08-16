package com.baoning.spring.boot.mongodb.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.baoning.spring.boot.mongodb.domain.File;
import com.baoning.spring.boot.mongodb.repository.FileRepository;
import com.baoning.spring.boot.mongodb.service.FileService;

@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	public FileRepository fileRepository;

	/**
	 * 保存文件
	 * @param file
	 * @return
	 */
	public File saveFile(File file) {
		return fileRepository.save(file);
	}

	/**
	 * 删除文件
	 * @param id
	 */
	public void removeFile(String id) {
		fileRepository.delete(id);
	}

	/**
	 * 根据id获取文件
	 * @param id
	 * @return
	 */
	public File getFileById(String id) {
		
		return fileRepository.findOne(id);
	}

	/**
	 * 分页查询，按上传时间降序
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public List<File> listFilesByPage(int pageIndex, int pageSize) {
		Page<File> page = null;
		List<File> list = null;
		//排序
		Sort sort = new Sort(Direction.DESC,"uploadDate");
		Pageable pageable = new PageRequest(pageIndex,pageSize,sort);
		
		page = fileRepository.findAll(pageable);
		list = page.getContent();
		
		return list;
	}

}
