package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load All of the CPU Registers
// Category: general/branch

object LOADALL extends InstructionDefinition("LOADALL") with LOADALLImpl

trait LOADALLImpl {
  implicit object LOADALL_0 extends LOADALL._0 {
    val opcode: TwoOpcodes = (0x0F, 0x05)
    override def hasImplicitOperand = true
  }
}
