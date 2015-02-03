package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: CPU Identification
// Category: general/control

object CPUID extends InstructionDefinition("CPUID") with CPUIDImpl

trait CPUIDImpl {
  implicit object CPUID_0 extends CPUID._0 {
    val opcode: TwoOpcodes = (0x0F, 0xA2)
    override def hasImplicitOperand = true
  }
}
